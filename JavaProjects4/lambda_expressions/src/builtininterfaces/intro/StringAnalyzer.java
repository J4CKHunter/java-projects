package builtininterfaces.intro;

@FunctionalInterface
public interface StringAnalyzer {
    public boolean analyze(String target, String searchStr);
}
