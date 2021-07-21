package assignment04;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Answer3 {
	public static void main(String[] args) {
		System.out.print("Lambda implementation using Consumer interface : ");
		Supplier<Integer> supply = () -> 9;
		Function<Integer,Integer> func = b -> b * b;
		Predicate<Integer> predict = a-> {
			if (a % 3 == 0)
				return true;
			else
				return false;
		};
		Consumer<Boolean> consume=a->{
			if(a)
				System.out.println("Number divisible by 3");
			else
				System.out.println("Number not divisible by 3");
		};
		buitInFunctionInvoke(consume,predict,func,supply);
	}
	private static void buitInFunctionInvoke(Consumer<Boolean> consume,Predicate<Integer> predict,Function<Integer, Integer> func,Supplier<Integer> supply) {
		consume.accept(predict.test(func.apply(supply.get())));
	}
}