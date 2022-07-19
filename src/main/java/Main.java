public class Main {
    public static void main(String[] args) {
        ConcatStringFunction func = str -> String.join("", str).toUpperCase();
        String res = func.apply("banana", "grape", "smoothie");
        System.out.println(res); // BANANAGRAPESMOOTHIE

				String res2 = func.apply("apple", "orange", "pineapple", "smoothie");
				System.out.println(res); // APPLEORANGEPINEAPPLESMOOTHIE
    }
}

@FunctionalInterface
// your code here
interface ConcatStringFunction {
      String apply(String... args);

}
