package com.iicind.datamod;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by dinesh_ch on 7/6/2016.
 */

@Entity
@Table(name = "")
public class ResarvationeEvent
{
    @Id
    private Long resarvationEvent;
    private String pnrNumber;



    public Long getResarvationEvent() {
        return resarvationEvent;
    }

    public void setResarvationEvent(Long resarvationEvent) {
        this.resarvationEvent = resarvationEvent;
    }

    public String getPnrNumber() {
        return pnrNumber;
    }

    public void setPnrNumber(String pnrNumber) {
        this.pnrNumber = pnrNumber;
    }

    public ResarvationeEvent()
    {
    }

    public ResarvationeEvent(Long resarvationEvent, String pnrNumber) {
        this.resarvationEvent = resarvationEvent;
        this.pnrNumber = pnrNumber;
    }
}
