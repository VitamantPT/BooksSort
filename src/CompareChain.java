/**
 * Билдер для построения цепи сравнения.
 * Порядок звеньев может быть любой, но результатом пустой цепи всегда будет равенство.
 *
 * Особенность: каждое последующее звено цепи вносит свой вклад только при условии,
 * что предыдущее звено не достигло искомой цель
 */

public class CompareChain {

    private int result;

    private static final CompareChain EQUAL = new CompareChain(0);
    private static final CompareChain LESS = new CompareChain(-1);
    private static final CompareChain GREATER = new CompareChain(1);

    private CompareChain(int result) {
        this.result = result;
    }

    public static CompareChain newChain() {
        return EQUAL;
    }

    public CompareChain compareNames(Book bookOne, Book bookTwo) {
        if (this.result == 0) {        
            int comResult = bookOne.getName().compareTo(bookTwo.getName());
            return comResult > 0 ? GREATER : comResult < 0 ? LESS : EQUAL;
        } else return this;
    }

    public CompareChain compareAuthorNames(Book bookOne, Book bookTwo) {
        if (this.result == 0) {
            int comResult = bookOne.getAuthorName().compareTo(bookTwo.getAuthorName());
            return comResult > 0 ? GREATER : comResult < 0 ? LESS : EQUAL;
        } else return this;
    }

    public CompareChain comparePublishDate(Book bookOne, Book bookTwo) {
        if (this.result == 0) {
            int comResult = bookOne.getPublishDate().compareTo(bookTwo.getPublishDate());
            return comResult > 0 ? GREATER : comResult < 0 ? LESS : EQUAL;
        } else return this;
    }
    
    public CompareChain buildChain() {
        return this;
    }

    public int buildResult() {
        return this.result;
    }
}
