
//Java code for using 'this' keyword to 
//refer current class instance variables 
class Test 
{ 
    int c; 
    int d; 
      
    // Parameterized constructor 
    Test(int a, int b) 
    { 
        this.c = a; 
        this.d = b; 
    } 
  
    void display() 
    { 
        //Displaying value of variables a and b 
        System.out.println("a = " + c + "  b = " + d); 
    } 
  
    public static void main(String[] args) 
    { 
        Test object = new Test(10, 20); 
        object.display(); 
    } 
} 
