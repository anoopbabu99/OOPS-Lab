public class q6 {

    public interface Operation {
        public Long perform( Long a, Long b );
    }

    // example of anonymous class(es)
    public static Operation add = new Operation() 
    { 
    	public Long perform( Long a, Long b ) 
    	{ 
    		return a + b; 
    	} 
    };
    public static Operation subtract = new Operation() 
    { 
    	public Long perform( Long a, Long b ) 
    	{ 
    		return a - b; 
    	} 
    };
    public static Operation divide = new Operation() 
    { 
    	public Long perform( Long a, Long b ) 
    	{ 
    		return a/ b; 
    	} 
    };
    public static Operation multiply = new Operation() 
    { 
    	public Long perform( Long a, Long b ) 
    	{ 
    		return a* b; 
    	} 
    };
   
    public static Long calculate( Operation op, Long a, Long b )
    {
        return op.perform( a, b );
    }

    // example of an inner class
    
    public static class Addition implements Operation {

        @Override
        public Long perform( Long a, Long b ) {
            return a + b;
        }
    }

    // example of polymorphism (one interface => many behaviours)
    public static void main( String[] args ) {

    	System.out.println( calculate( add, 27L, 3L ) );
    	System.out.println( calculate( new Addition(), 27L, 3L ) );
        System.out.println( calculate( subtract, 27L, 3L ) );
        System.out.println( calculate( divide, 27L, 3L ) );
        System.out.println( calculate( multiply, 27L, 3L ) );
    }
}