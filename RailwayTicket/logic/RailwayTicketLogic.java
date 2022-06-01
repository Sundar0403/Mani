package logic;
import passenger.*;
import ticket.*;
import cache.*;
import java.util.*;

public class RailwayTicketLogic
{
	CacheLayer cacheObj=new CacheLayer();
	
	private int custId=100;
	private int ticketId=10000;
	private int seatNo=0;
	
	public int getTicketId()
	{
		return ++ticketId;
	}
	public int getCustId()
	{
		return ++custId;
	}
	public int getSeatNo()
	{
		return ++seatNo;
	}
	
	public Map<Integer,PassengerDetails> setPassenger(int passengerId,PassengerDetails passengerObj) throws Exception
	{
		Map<Integer,PassengerDetails> passengerMap=cacheObj.setPassenger(passengerId,passengerObj);
		return passengerMap;
	}
}
