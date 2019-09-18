class Driver {
	 public static void Main(String[] args) {
		 Pizza first = null, last = null;
		 Methods m = new Methods();
			m.enqueue(first, last, new Pizza("pepperoni", "1234 Bobcat Trail"));
			m.enqueue(first, last, new Pizza("sausage", "2345 University Drive"));
			m.deliver(first, last);
			m.enqueue(first, last, new Pizza("extra cheese", "3456 Rickster Road"));
			m.enqueue(first, last, new Pizza("everything", "4567 King Court"));
			m.enqueue(first, last, new Pizza("coffee beans", "5678 Java Circle"));
			m.deliver(first, last);
			m.deliver(first, last);
			m.deliver(first, last);
			m.deliver(first, last);
			m.deliver(first, last);
	 }
	 
 }
public class Pizza {
	String ingredients,address;
	Pizza next = new Pizza();
	Pizza(String ingredients, String address)
	{
		this.address = address;
		this.ingredients = ingredients;
		next = null;
	}
	public Pizza() {
		// TODO Auto-generated constructor stub
	}

}

 class Methods {
	 public void enqueue(Pizza head, Pizza tail, Pizza thispizza) {
		 if (head == null) head = thispizza;
		 else tail.next = thispizza;
		 tail = thispizza; return;
	 }
	 
	 public Pizza dequeue(Pizza head, Pizza tail) {
		Pizza pizzatodeliver = null;
		if(head != null)
		{pizzatodeliver = head; head = head.next;}
		if(head == null) tail = null;
		 return pizzatodeliver;
		 
	 }
	 
	 public void deliver(Pizza head, Pizza tail) {
		 Pizza thispizza = dequeue(head, tail);
		 if(thispizza == null)
		 {System.out.println("No deliveries pending"); return;}
		 System.out.println("Deliver a pizza with " + thispizza.ingredients
					+ " to " + thispizza.address);
	 }
 }