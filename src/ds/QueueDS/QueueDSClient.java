package ds.QueueDS;

public class QueueDSClient {

	public static void main(String[] args) {
		
		QueueDS myQueue=new QueueDS(5);
		
	
		myQueue.standinQueue(100);
		myQueue.standinQueue(101);
		myQueue.standinQueue(102);
		myQueue.standinQueue(103);
		myQueue.standinQueue(104);
		
	
		myQueue.serveQueueElement();
		
		myQueue.standinQueue(100);

		
		myQueue.getQueueStats();
		
		

	}

}
