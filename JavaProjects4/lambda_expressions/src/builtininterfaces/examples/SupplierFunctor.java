package builtininterfaces.examples;

import java.util.function.Function;
import java.util.function.Supplier;

@FunctionalInterface
public interface SupplierFunctor<T> extends Supplier<T> {
    default <T1> SupplierFunctor<T1> andThen(Function<T, T1> f){
        return () -> f.apply(this.get());
    }
}
