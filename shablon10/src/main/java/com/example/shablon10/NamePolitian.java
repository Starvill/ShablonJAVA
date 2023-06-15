package com.example.shablon10;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

class NamePolitian {
    private Politician politic;
    public void walk() {
        System.out.println("I'm politic " +
                politic.doPolitic());
    }
    public void setPolitic(Politician politic) {
        this.politic = politic;
    }
}
interface Politician {
    String doPolitic();
}
class Biden implements Politician{
    @Override
    public String doPolitic() {
        return "Biden";
    }
}

class Trump implements Politician {
    @Override
    public String doPolitic() {
        return "Trump";
    }
}
class Merkel implements Politician {
    @Override
    public String doPolitic() {
        return "Merkel";
    }
}

