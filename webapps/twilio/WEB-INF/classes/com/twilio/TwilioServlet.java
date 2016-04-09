package com.twilio;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.twilio.sdk.verbs.TwiMLResponse;
import com.twilio.sdk.verbs.TwiMLException;
import com.twilio.sdk.verbs.Sms;
import com.twilio.sdk.verbs.Message;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;





public class TwilioServlet extends HttpServlet {


    // service() responds to both GET and POST requests.
    // You can also use doGet() or doPost()
    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {

        HttpSession session = request.getSession(true);


        if (session.getAttribute("player") == null) {
          session.setAttribute("player", new Player());
        }

        Player player = (Player) session.getAttribute("player");

        StoryMaker story = new StoryMaker(player);


        // Must call makeResponse before getLastVisited. Actually Don't need to update history Array because it updates automatically.
        String message = story.makeResponse(request.getParameter("Body"));


        // Create a TwiML response and add our friendly message.
        TwiMLResponse twiml = new TwiMLResponse();
        Sms sms = new Sms(message);
        try {
            twiml.append(sms);
        } catch (TwiMLException e) {
            e.printStackTrace();
        }

        response.setContentType("application/xml");
        response.getWriter().print(twiml.toXML());
    }
}
