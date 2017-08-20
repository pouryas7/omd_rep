package ca.mcmaster.mmilani.omd.datalog.primitives;

public class Variable extends Term {
    public String name;
    Rule rule;

    public Variable(String name, Rule rule) {
        this.name = name;
        this.rule = rule;
    }

    @Override
    public String toString() {
        return "" + name;
    }
}