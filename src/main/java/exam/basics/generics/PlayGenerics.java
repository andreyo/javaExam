package exam.basics.generics;

/**
 * Created by IntelliJ IDEA.
 * User: Elena
 * Date: 06.03.11
 * Time: 13:48
 * To change this template use File | Settings | File Templates.
 */
public class PlayGenerics<H, A> {

    H hVariable;

    public H gethVariable() {
        return hVariable;
    }

    public void sethVariable(H hVariable) {
        this.hVariable = hVariable;
    }

    public static void main(String[] args) {
        PlayGenerics playGenerics = new PlayGenerics();
        playGenerics.sethVariable("Hello World");
        System.out.println(playGenerics.gethVariable());
    }

}
