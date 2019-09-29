package ch9_specification.construct;

import java.util.Collection;
import java.util.Set;

public interface WarehousePacker {
    /**
     * ドラム缶をコンテナに格納する
     *
     */
    void pack(Set<Container> containerToFill, Set<Drum> drumToPack) throws NoAnswerFoundException;
}
