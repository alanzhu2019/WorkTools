package com.alan.pojo;


import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

public class Scheduling {

  private String code;
  private String mo;
  private String groupmo;
  private String ordertypecode;
  private String workshopcode;
  private String charlinecode;
  private String lineleaderitcode;
  private String shiftid;
  private String pilotrun;
  private String topbot;
  @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
  private Date workdate; //开工日期
  private String begdate;
  private String enddate;
  private String isplayforkplate;
  private String playforkplateseat;
  private Date realitybegintime;
  private Date realityendtime;
  private String productclasscode;
  private String materialcode;
  private String phonemodelid;
  private String pcbcode;
  private String moqty;
  private String schedulingqty;
  private String khplanqty;
  private String inputqty;
  private String completeqty;
  private String islock;
  private String status;
  private String workstatus;
  private String printcount;
  private String totalqty;
  private String processlimit;
  private String weldpercent;
  private String points;
  private Date predictionbegdate;
  private String beghour;
  private String begminute;
  private String endhour;
  private String endminute;
  private Date etbegtime;
  private Date etendtime;
  private String firstmaterialqty;
  private Date firstmaterialdate;
  private String materialstacktablecode;
  private String abovestatus;
  private String belowstatus;
  private String callstatus;
  private String preparationstatus;
  private String tbline;
  private String groupid;
  private String ismaterialtransfer;
  private String isfirst;
  private Date issueddate;
  private String scrollby;
  private String equipmentinputqty;
  private String invalidworkminutes;
  private Date switchtime;
  private String remark;
  private String createuser;
  private Date createtime;
  private String modiuser;
  private Date moditime;
  private String workgroupcode;
  private String smtmaterialcode;
  private String guid;
  private Date psd;
  private Date crsd;
  private String engineerremark;


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }


  public String getMo() {
    return mo;
  }

  public void setMo(String mo) {
    this.mo = mo;
  }


  public String getGroupmo() {
    return groupmo;
  }

  public void setGroupmo(String groupmo) {
    this.groupmo = groupmo;
  }


  public String getOrdertypecode() {
    return ordertypecode;
  }

  public void setOrdertypecode(String ordertypecode) {
    this.ordertypecode = ordertypecode;
  }


  public String getWorkshopcode() {
    return workshopcode;
  }

  public void setWorkshopcode(String workshopcode) {
    this.workshopcode = workshopcode;
  }


  public String getCharlinecode() {
    return charlinecode;
  }

  public void setCharlinecode(String charlinecode) {
    this.charlinecode = charlinecode;
  }


  public String getLineleaderitcode() {
    return lineleaderitcode;
  }

  public void setLineleaderitcode(String lineleaderitcode) {
    this.lineleaderitcode = lineleaderitcode;
  }


  public String getShiftid() {
    return shiftid;
  }

  public void setShiftid(String shiftid) {
    this.shiftid = shiftid;
  }


  public String getPilotrun() {
    return pilotrun;
  }

  public void setPilotrun(String pilotrun) {
    this.pilotrun = pilotrun;
  }


  public String getTopbot() {
    return topbot;
  }

  public void setTopbot(String topbot) {
    this.topbot = topbot;
  }


  public Date getWorkdate() {
    return workdate;
  }

  public void setWorkdate(Date workdate) {
    this.workdate = workdate;
  }


  public String getBegdate() {
    return begdate;
  }

  public void setBegdate(String begdate) {
    this.begdate = begdate;
  }


  public String getEnddate() {
    return enddate;
  }

  public void setEnddate(String enddate) {
    this.enddate = enddate;
  }


  public String getIsplayforkplate() {
    return isplayforkplate;
  }

  public void setIsplayforkplate(String isplayforkplate) {
    this.isplayforkplate = isplayforkplate;
  }


  public String getPlayforkplateseat() {
    return playforkplateseat;
  }

  public void setPlayforkplateseat(String playforkplateseat) {
    this.playforkplateseat = playforkplateseat;
  }


  public Date getRealitybegintime() {
    return realitybegintime;
  }

  public void setRealitybegintime(Date realitybegintime) {
    this.realitybegintime = realitybegintime;
  }


  public Date getRealityendtime() {
    return realityendtime;
  }

  public void setRealityendtime(Date realityendtime) {
    this.realityendtime = realityendtime;
  }


  public String getProductclasscode() {
    return productclasscode;
  }

  public void setProductclasscode(String productclasscode) {
    this.productclasscode = productclasscode;
  }


  public String getMaterialcode() {
    return materialcode;
  }

  public void setMaterialcode(String materialcode) {
    this.materialcode = materialcode;
  }


  public String getPhonemodelid() {
    return phonemodelid;
  }

  public void setPhonemodelid(String phonemodelid) {
    this.phonemodelid = phonemodelid;
  }


  public String getPcbcode() {
    return pcbcode;
  }

  public void setPcbcode(String pcbcode) {
    this.pcbcode = pcbcode;
  }


  public String getMoqty() {
    return moqty;
  }

  public void setMoqty(String moqty) {
    this.moqty = moqty;
  }


  public String getSchedulingqty() {
    return schedulingqty;
  }

  public void setSchedulingqty(String schedulingqty) {
    this.schedulingqty = schedulingqty;
  }


  public String getKhplanqty() {
    return khplanqty;
  }

  public void setKhplanqty(String khplanqty) {
    this.khplanqty = khplanqty;
  }


  public String getInputqty() {
    return inputqty;
  }

  public void setInputqty(String inputqty) {
    this.inputqty = inputqty;
  }


  public String getCompleteqty() {
    return completeqty;
  }

  public void setCompleteqty(String completeqty) {
    this.completeqty = completeqty;
  }


  public String getIslock() {
    return islock;
  }

  public void setIslock(String islock) {
    this.islock = islock;
  }


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  public String getWorkstatus() {
    return workstatus;
  }

  public void setWorkstatus(String workstatus) {
    this.workstatus = workstatus;
  }


  public String getPrintcount() {
    return printcount;
  }

  public void setPrintcount(String printcount) {
    this.printcount = printcount;
  }


  public String getTotalqty() {
    return totalqty;
  }

  public void setTotalqty(String totalqty) {
    this.totalqty = totalqty;
  }


  public String getProcesslimit() {
    return processlimit;
  }

  public void setProcesslimit(String processlimit) {
    this.processlimit = processlimit;
  }


  public String getWeldpercent() {
    return weldpercent;
  }

  public void setWeldpercent(String weldpercent) {
    this.weldpercent = weldpercent;
  }


  public String getPoints() {
    return points;
  }

  public void setPoints(String points) {
    this.points = points;
  }


  public Date getPredictionbegdate() {
    return predictionbegdate;
  }

  public void setPredictionbegdate(Date predictionbegdate) {
    this.predictionbegdate = predictionbegdate;
  }


  public String getBeghour() {
    return beghour;
  }

  public void setBeghour(String beghour) {
    this.beghour = beghour;
  }


  public String getBegminute() {
    return begminute;
  }

  public void setBegminute(String begminute) {
    this.begminute = begminute;
  }


  public String getEndhour() {
    return endhour;
  }

  public void setEndhour(String endhour) {
    this.endhour = endhour;
  }


  public String getEndminute() {
    return endminute;
  }

  public void setEndminute(String endminute) {
    this.endminute = endminute;
  }


  public Date getEtbegtime() {
    return etbegtime;
  }

  public void setEtbegtime(Date etbegtime) {
    this.etbegtime = etbegtime;
  }


  public Date getEtendtime() {
    return etendtime;
  }

  public void setEtendtime(Date etendtime) {
    this.etendtime = etendtime;
  }


  public String getFirstmaterialqty() {
    return firstmaterialqty;
  }

  public void setFirstmaterialqty(String firstmaterialqty) {
    this.firstmaterialqty = firstmaterialqty;
  }


  public Date getFirstmaterialdate() {
    return firstmaterialdate;
  }

  public void setFirstmaterialdate(Date firstmaterialdate) {
    this.firstmaterialdate = firstmaterialdate;
  }


  public String getMaterialstacktablecode() {
    return materialstacktablecode;
  }

  public void setMaterialstacktablecode(String materialstacktablecode) {
    this.materialstacktablecode = materialstacktablecode;
  }


  public String getAbovestatus() {
    return abovestatus;
  }

  public void setAbovestatus(String abovestatus) {
    this.abovestatus = abovestatus;
  }


  public String getBelowstatus() {
    return belowstatus;
  }

  public void setBelowstatus(String belowstatus) {
    this.belowstatus = belowstatus;
  }


  public String getCallstatus() {
    return callstatus;
  }

  public void setCallstatus(String callstatus) {
    this.callstatus = callstatus;
  }


  public String getPreparationstatus() {
    return preparationstatus;
  }

  public void setPreparationstatus(String preparationstatus) {
    this.preparationstatus = preparationstatus;
  }


  public String getTbline() {
    return tbline;
  }

  public void setTbline(String tbline) {
    this.tbline = tbline;
  }


  public String getGroupid() {
    return groupid;
  }

  public void setGroupid(String groupid) {
    this.groupid = groupid;
  }


  public String getIsmaterialtransfer() {
    return ismaterialtransfer;
  }

  public void setIsmaterialtransfer(String ismaterialtransfer) {
    this.ismaterialtransfer = ismaterialtransfer;
  }


  public String getIsfirst() {
    return isfirst;
  }

  public void setIsfirst(String isfirst) {
    this.isfirst = isfirst;
  }


  public Date getIssueddate() {
    return issueddate;
  }

  public void setIssueddate(Date issueddate) {
    this.issueddate = issueddate;
  }


  public String getScrollby() {
    return scrollby;
  }

  public void setScrollby(String scrollby) {
    this.scrollby = scrollby;
  }


  public String getEquipmentinputqty() {
    return equipmentinputqty;
  }

  public void setEquipmentinputqty(String equipmentinputqty) {
    this.equipmentinputqty = equipmentinputqty;
  }


  public String getInvalidworkminutes() {
    return invalidworkminutes;
  }

  public void setInvalidworkminutes(String invalidworkminutes) {
    this.invalidworkminutes = invalidworkminutes;
  }


  public Date getSwitchtime() {
    return switchtime;
  }

  public void setSwitchtime(Date switchtime) {
    this.switchtime = switchtime;
  }


  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }


  public String getCreateuser() {
    return createuser;
  }

  public void setCreateuser(String createuser) {
    this.createuser = createuser;
  }


  public Date getCreatetime() {
    return createtime;
  }

  public void setCreatetime(Date createtime) {
    this.createtime = createtime;
  }


  public String getModiuser() {
    return modiuser;
  }

  public void setModiuser(String modiuser) {
    this.modiuser = modiuser;
  }


  public Date getModitime() {
    return moditime;
  }

  public void setModitime(Date moditime) {
    this.moditime = moditime;
  }


  public String getWorkgroupcode() {
    return workgroupcode;
  }

  public void setWorkgroupcode(String workgroupcode) {
    this.workgroupcode = workgroupcode;
  }


  public String getSmtmaterialcode() {
    return smtmaterialcode;
  }

  public void setSmtmaterialcode(String smtmaterialcode) {
    this.smtmaterialcode = smtmaterialcode;
  }


  public String getGuid() {
    return guid;
  }

  public void setGuid(String guid) {
    this.guid = guid;
  }


  public Date getPsd() {
    return psd;
  }

  public void setPsd(Date psd) {
    this.psd = psd;
  }


  public Date getCrsd() {
    return crsd;
  }

  public void setCrsd(Date crsd) {
    this.crsd = crsd;
  }


  public String getEngineerremark() {
    return engineerremark;
  }

  public void setEngineerremark(String engineerremark) {
    this.engineerremark = engineerremark;
  }


  @Override
  public String toString() {
    return "Scheduling{" +
            "code='" + code + '\'' +
            ", mo='" + mo + '\'' +
            ", groupmo='" + groupmo + '\'' +
            ", ordertypecode='" + ordertypecode + '\'' +
            ", workshopcode='" + workshopcode + '\'' +
            ", charlinecode='" + charlinecode + '\'' +
            ", lineleaderitcode='" + lineleaderitcode + '\'' +
            ", shiftid='" + shiftid + '\'' +
            ", pilotrun='" + pilotrun + '\'' +
            ", topbot='" + topbot + '\'' +
            ", workdate=" + workdate +
            ", begdate='" + begdate + '\'' +
            ", enddate='" + enddate + '\'' +
            ", isplayforkplate='" + isplayforkplate + '\'' +
            ", playforkplateseat='" + playforkplateseat + '\'' +
            ", realitybegintime=" + realitybegintime +
            ", realityendtime=" + realityendtime +
            ", productclasscode='" + productclasscode + '\'' +
            ", materialcode='" + materialcode + '\'' +
            ", phonemodelid='" + phonemodelid + '\'' +
            ", pcbcode='" + pcbcode + '\'' +
            ", moqty='" + moqty + '\'' +
            ", schedulingqty='" + schedulingqty + '\'' +
            ", khplanqty='" + khplanqty + '\'' +
            ", inputqty='" + inputqty + '\'' +
            ", completeqty='" + completeqty + '\'' +
            ", islock='" + islock + '\'' +
            ", status='" + status + '\'' +
            ", workstatus='" + workstatus + '\'' +
            ", printcount='" + printcount + '\'' +
            ", totalqty='" + totalqty + '\'' +
            ", processlimit='" + processlimit + '\'' +
            ", weldpercent='" + weldpercent + '\'' +
            ", points='" + points + '\'' +
            ", predictionbegdate=" + predictionbegdate +
            ", beghour='" + beghour + '\'' +
            ", begminute='" + begminute + '\'' +
            ", endhour='" + endhour + '\'' +
            ", endminute='" + endminute + '\'' +
            ", etbegtime=" + etbegtime +
            ", etendtime=" + etendtime +
            ", firstmaterialqty='" + firstmaterialqty + '\'' +
            ", firstmaterialdate=" + firstmaterialdate +
            ", materialstacktablecode='" + materialstacktablecode + '\'' +
            ", abovestatus='" + abovestatus + '\'' +
            ", belowstatus='" + belowstatus + '\'' +
            ", callstatus='" + callstatus + '\'' +
            ", preparationstatus='" + preparationstatus + '\'' +
            ", tbline='" + tbline + '\'' +
            ", groupid='" + groupid + '\'' +
            ", ismaterialtransfer='" + ismaterialtransfer + '\'' +
            ", isfirst='" + isfirst + '\'' +
            ", issueddate=" + issueddate +
            ", scrollby='" + scrollby + '\'' +
            ", equipmentinputqty='" + equipmentinputqty + '\'' +
            ", invalidworkminutes='" + invalidworkminutes + '\'' +
            ", switchtime=" + switchtime +
            ", remark='" + remark + '\'' +
            ", createuser='" + createuser + '\'' +
            ", createtime=" + createtime +
            ", modiuser='" + modiuser + '\'' +
            ", moditime=" + moditime +
            ", workgroupcode='" + workgroupcode + '\'' +
            ", smtmaterialcode='" + smtmaterialcode + '\'' +
            ", guid='" + guid + '\'' +
            ", psd=" + psd +
            ", crsd=" + crsd +
            ", engineerremark='" + engineerremark + '\'' +
            '}';
  }
}
