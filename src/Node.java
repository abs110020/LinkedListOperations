
class Node
	{
		// reference to the next node in the chain,
		// or null if there isn't one.
		Node next;
		// data carried by this node.
		// could be of any type you need.
		int data;
		

		// Node constructor
		public Node(int _data)
		{
			next = null;
			data = _data;
		}
		
		// another Node constructor if we want to
		// specify the node to point to.
		public Node(int _data, Node _next)
		{
			next = _next;
			data = _data;
		}
		
		// these methods should be self-explanatory
		public int getData()
		{
			return data;
		}
		
		public void setData(int _data)
		{
			data = _data;
		}
		
		public Node getNext()
		{
			return next;
		}
		
		public void setNext(Node _next)
		{
			next = _next;
		}
	}
