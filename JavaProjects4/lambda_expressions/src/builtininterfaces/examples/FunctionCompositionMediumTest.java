package builtininterfaces.examples;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionCompositionMediumTest {
    public static void main(String[] args) {

//        functionComposition();
//        biFunctionComposition();
        supplierComposition();
    }

    public static void functionComposition(){

        Function<Double, Double> discountPremium = price -> price * 0.8;
        Function<Double, String> getPriceTag = price -> String.format("Discounted Price : %s ", price);

        Function<Double, String> getDiscountedPriceTag = discountPremium.andThen(getPriceTag);

        var discountedPrice = getDiscountedPriceTag.apply((double)100);

        System.out.println(discountedPrice);

    }

    public static void biFunctionComposition(){

        BiFunction<Double, Double, Double> discountStrategy = (discount, price) -> price - discount * price;
        Function<Double, String> getPriceTag = price -> String.format("Discounted Price : %s ", price);

        BiFunction<Double,Double,String> getDiscountedPriceTag = discountStrategy.andThen(getPriceTag);

        var discountedPrice = getDiscountedPriceTag.apply(0.2, 100.0);

        System.out.println(discountedPrice);
    }

    public static void supplierComposition(){
        SupplierFunctor<Integer> d = () -> 5;
        SupplierFunctor<Integer> f = d.andThen(x -> x + 5);

        var value = f.get();
        System.out.println(value);
    }

}
