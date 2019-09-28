package ch9_specification.construct;

import java.util.Collection;

public interface WarehousePacker {
    /**
     * ドラム缶をコンテナに格納する
     *
     */
    void pack(Collection containerToFill, Collection drumToPack);
}
