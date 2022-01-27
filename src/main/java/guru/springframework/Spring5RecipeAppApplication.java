package guru.springframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class Spring5RecipeAppApplication {

	public static void main(String[] args) {
		/*int[] tab = {-2, -1,0,1,3,7,19,4,5};

		int a = Integer.MAX_VALUE;
		List<Integer> trier = Arrays.stream(tab).boxed().sorted().collect(Collectors.toList());
		for(int i = 0; i<trier.size(); i++){
			if(i + 1 <trier.size()){
				if(trier.get(i+1) - trier.get(i) >0 && trier.get(i+1) - trier.get(i) <a ){
					a = trier.get(i+1) -trier.get(i);
				}
			}
			if(a == 0) {
				break;
			}
		}
		System.out.println(a);*/
		SpringApplication.run(Spring5RecipeAppApplication.class, args);
	}
}
