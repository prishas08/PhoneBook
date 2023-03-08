
public class Entry {
	
	private class EntryNode
	{
		Entry e;
		EntryNode next;

		public EntryNode(Entry e, EntryNode node)
		{
			this.e = e;
			this.next = node;
		}
		
		@Override
		public String toString()
		{
			return "" + this.e;
		}
	}
	Person Person;
	PhoneNumber PhoneNumber;
	EntryNode head;
	EntryNode last;
	
	public Entry(Person Person, PhoneNumber PhoneNumber)
	{
		this.Person = Person;
		this.PhoneNumber = PhoneNumber;
		head = new EntryNode(new Entry(Person,PhoneNumber),null);
	}
	
	public PhoneNumber remove(Person key)
	{
		PhoneNumber x = null;
		EntryNode temp = this.head;
		while(temp!=null)
		{
			if(temp.e.Person==key)
			{
				EntryNode temp2 = temp.next;
				x = temp2.e.PhoneNumber;
				temp2 = temp2.next;
				temp.next = temp2;
			}
			temp = temp.next;
		}
		return x;
		
	}
	
	public PhoneNumber add(Person P, PhoneNumber PN)
	{
		PhoneNumber PNumber = null;
		if(head!=null)
		{
			EntryNode temp = this.head;
			while(temp.next!=null)
			{
				temp = temp.next;
			}
			PNumber = temp.e.PhoneNumber;
			EntryNode list = new EntryNode(new Entry(Person,PhoneNumber), null);
			temp.next = list;
		}
		else
		{
			head = new EntryNode(new Entry(P, PN),null);
		}
		return PNumber;
	}
	
	public int size()
	{
		EntryNode temp = this.head;
		int counter = 0;
		while(temp!=null)
		{
			temp = temp.next;
			counter++;
		}
		return counter;	
	}
	
	public PhoneNumber get(Person p)
	{
		PhoneNumber x = null;
		EntryNode temp = this.head;
		while(temp!=null)
		{
			if(temp.e.Person == p)
			{
				x = temp.e.PhoneNumber;
			}
			temp = temp.next;
		}
		return x;
		
	}
	
	public Entry get(int index)
	{
		Entry x = null;
		EntryNode temp = this.head;
		int counter = 0;
		while(temp!=null)
		{
			if(counter==index)
			{
				x = temp.e;
			}
			temp = temp.next;
			counter++;
		}
		if(index>counter)
		{
			throw new IndexOutOfBoundsException("Index Argument Is Out Of Bounds");
		}
		return x;
		
	}
	
	

}
