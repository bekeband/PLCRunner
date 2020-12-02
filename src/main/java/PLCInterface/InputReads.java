package PLCInterface;

import java.util.List;

public interface InputReads {
    int readPortsCount = 10;

    void readInputs(List<Object> destination);
}
