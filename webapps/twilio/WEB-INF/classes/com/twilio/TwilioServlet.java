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

        if (session.getAttribute("history") == null) {
          session.setAttribute("history", new ArrayList<Integer>());
        }
		    ArrayList<Integer> history = (ArrayList<Integer>) session.getAttribute("history");

        StoryMaker story = new StoryMaker(history);


        // Must call makeResponse before getLastVisited
        String message = story.makeResponse("test");

        history.add(story.getLastVisited());

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
