package com.iicind.datamod;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by dinesh_ch on 7/6/2016.
 */

    //To get the data from database and display it on browser as Json Format.
    //this class acts as a RestController class
@RestController
//To point the particular resource
@RequestMapping("/resarvationeEvents")
public class ResarvationEventController
{
  //To inject beans explicitly for ResarvationEventRepository
    @Autowired
    ResarvationEventRepository eventRepository;

    //To get all Ticket bookhing details
    @RequestMapping("/get")
     public List<ResarvationeEvent> getDeatils()
     {
        return eventRepository.findAll();
     }

    //To get Particular Ticket information
    @RequestMapping("/getcu")
    public ResarvationeEvent getCurrent()
    {
        return eventRepository.findOne(565487l);
    }

    //To Book a Ticket
    @RequestMapping("/book")
     public void bookTicket()
     {
        ResarvationeEvent event=new ResarvationeEvent();
        event.setResarvationEvent(565487l);
        event.setPnrNumber("ger5369");
        eventRepository.save(event);
     }

    //To cancle a Ticket
    @RequestMapping("/cancle")
     public void cancleTicket()
     {
        eventRepository.delete(4568l);
     }

//    //To Update Ticket Information
//    @RequestMapping("/update")
//    public void updateInfo()
//    {
//        eventRepository.
//    }
}
