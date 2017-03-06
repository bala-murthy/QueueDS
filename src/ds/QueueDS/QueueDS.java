package ds.QueueDS;

public class QueueDS {
	
	// Declare the max size of Queue, the first and last element's
	// index position when the Queue is empty.
	
	private int queueSize=0;
	private int firstElementIndex=-1;
	private int lastElementIndex=-1;
	private int nItems=0;
	
	private int[] queueArray;
	
	public QueueDS(){
		
	}
	
	public QueueDS(int queueSize){
		this.queueSize=queueSize;
		queueArray=new int[queueSize];
	}
	
	public boolean isQueueEmpty(){
		return (firstElementIndex==-1 && lastElementIndex==-1)?true:false;
	}
	
	public boolean isQueueFull(){
		return (lastElementIndex == (queueSize-1)?true:false);
	}
	
	public int getFirstElementIndex(){
		return firstElementIndex;
	}
	
	public int getLastElementIndex(){
		return lastElementIndex;
	}
	
	public void standinQueue(int queueElement){
		if(isQueueFull()){
			System.out.println("Queue is Full ! Cannot add element !!");
		}
		else{
			if(isQueueEmpty()){
				queueArray[++firstElementIndex]=queueElement;
				System.out.println("Added First Element "+queueElement+" at Index "+firstElementIndex);
				lastElementIndex++;
				nItems++;
			}
			else{
				queueArray[++lastElementIndex]=queueElement;
				System.out.println("Added "+queueElement+" at Index "+lastElementIndex);
				nItems++;
			}
		}
	}
	
	
	public void serveQueueElement(){
		
		// Initialize pointer variable
		int pointer;
		
		//Check if Queue is Empty. If so, do not make any attempt to process
		if(nItems==0)
			return;
		
		// print the first element in queue OR pop out first person in Queue
		System.out.println(queueArray[firstElementIndex]+" - Element moved out of Queue!!");
		
		// Move others in Queue one position ahead
		for(pointer=0;pointer <((queueArray.length-1));pointer++){
			queueArray[pointer]=queueArray[pointer+1];
		}
		queueArray[lastElementIndex]=0;
		nItems--;
		lastElementIndex --;
		
/*		for(int i:queueArray){
			System.out.println("Elements in Queue :: "+ i);
		}*/
	}
	
	public void getQueueStats(){
		System.out.println("Max Size of Queue is :: "+queueSize);
		System.out.println("Queue Currently has "+(nItems)+" Members.");
		System.out.println("Index of First Element is :: "+firstElementIndex);
		System.out.println("Index of Last Element is :: "+lastElementIndex);
		System.out.println("Queue has "+(queueSize-(lastElementIndex+1))+" Vaccant Positions.");
		
		// Print All Elements in Queue
		System.out.print("Elements in Queues are  [");
		for(int i:queueArray){
			System.out.print(" "+i);
		}
		System.out.println(" ]");
		
	}

}
