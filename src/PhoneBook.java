
public class PhoneBook implements IMap {

	Entry[] pb;
	@Override
	public PhoneNumber put(Person person, PhoneNumber phone) 
	{
		PhoneNumber x = pb[pb.length-1].add(person, phone);
		return x;
	}

	@Override
	public PhoneNumber get(Person person) 
	{
		PhoneNumber x = pb[pb.length-1].get(person);
		return x;
	}

	@Override
	public int size() 
	{
		int x = pb[pb.length-1].size();
		return x;
	}

	@Override
	public PhoneNumber remove(Person person) 
	{
		PhoneNumber x = pb[pb.length-1].remove(person);
		return x;
	}
	
	

}
