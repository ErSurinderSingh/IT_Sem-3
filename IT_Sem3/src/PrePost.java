
public class PrePost {
    public static void main(String[] args) {
        int a = 5;
        System.out.println("a = " + a);
        
        //Pre increment:
        System.out.println("Pre Increment:");
        System.out.println("a = " + ++a);
        System.out.println("a = " + a);
        
        //Pre drecrement:
        System.out.println("Pre Decrement:");
        System.out.println("a = " + --a);
        System.out.println("a = " + a);
        
        //Post Increment:
        System.out.println("Post Increment:");
        System.out.println("a = " + a++);
        System.out.println("a = " + a);
        
        //post drcrement:
        System.out.println("Post Decrement:");
        System.out.println("a = " + a--);
        System.out.println("a = " + a);
    }
}
