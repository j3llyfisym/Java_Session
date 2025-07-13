package NumberAPI.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/")
public class GreetingController {

    @GetMapping("/hello")
    public static String hello(){
        return("Hello World!");
    }

    @GetMapping("/greet")
    public static String greet(@RequestParam(name="name")String name){
        return("Hello "+name+ "!");
    }
    static ArrayList<Integer>numbers = new ArrayList<Integer>();

    @PostMapping("/addItem")
    public static ResponseEntity<ArrayList<Integer>> addItem(@RequestBody int number){
        numbers.add(number);
        return(ResponseEntity.ok(numbers));
    }
}
