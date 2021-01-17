import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> urlInfo = new ArrayDeque<>();
        String URL = scanner.nextLine();
        String currentURL = "";
        while (!URL.equals("Home")){
            if(URL.equals("back")){
                if(!urlInfo.isEmpty()){
                    currentURL=urlInfo.pop();
                }else{
                    System.out.println("no previous URLs");
                    URL = scanner.nextLine();
                    continue;
                }
            }else{
                if(!currentURL.equals("")){
                    urlInfo.push(currentURL);
                }
                currentURL=URL;
            }
            System.out.println(currentURL);
            URL=scanner.nextLine();
        }
    }
}
