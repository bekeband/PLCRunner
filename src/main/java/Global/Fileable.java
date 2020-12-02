package Global;

import java.util.List;

public interface Fileable {
    List<?> read(String fileName);
    void write(List<?> list);
}
