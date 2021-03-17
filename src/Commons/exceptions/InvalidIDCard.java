package Commons.exceptions;

public class InvalidIDCard extends Exception {
    public InvalidIDCard() {
    }

    public InvalidIDCard(String message) {
        super(message);
    }
}
