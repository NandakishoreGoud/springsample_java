/**
 * Created by cts1 on 12/10/17.
 */
public class HelloSpring {
    private String message;

    public void setMessage(String message){
        this.message  = message;
    }
    public void getMessage(){
        System.out.println("Your Message : " + message);
    }
}
