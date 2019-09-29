package ch9_specification.construct;

import java.util.Set;

/**
 * プロトタイプ格納サービス
 */
public class PrototypePacker implements WarehousePacker {
    /**
     * コンテナ群にドラム缶群をいい感じに格納する
     * トランザクション管理はしない
     *
     * @param containers 格納先コンテナ
     * @param drums      格納先のドラムたち
     */
    @Override
    public void pack(Set<Container> containers, Set<Drum> drums) throws NoAnswerFoundException {

        for (Drum drum : drums) {
            Container container = findContainerFor(containers, drum);
            container.add(drum);
        }
    }

    private Container findContainerFor(Set<Container> containers, Drum drum) throws NoAnswerFoundException {

        // streamでかくと参照を返せないし、、、
        for (Container container : containers) {
            if (container.canAccommodate(drum)) {
                return container;
            }
        }
        throw new NoAnswerFoundException();
    }
}
