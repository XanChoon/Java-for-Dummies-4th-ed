class MethodsSample{
// Constructor method

    MethodsSample(){
        System.out.println("Constructor method is called when an object of its class is created");
    }

// Main method where program execution begins

    public static void main(String[]args){
        staticMethod();
        MethodsSample object = new MethodsSample();
        object.nonStaticMethod();
    }

// Static method
    static void staticMethod(){
        System.out.println("Static method can be called without creating object");
    }

// Non static method
    void nonStaticMethod(){
        System.out.println("Non static method must be called by creating an object");
    }
}
