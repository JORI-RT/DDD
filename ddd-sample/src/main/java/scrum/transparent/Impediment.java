package scrum.transparent;

import java.util.Objects;

/**
 * スクラムコンテキストにおける、チームのプロダクト生産を妨げる要因
 */
public class Impediment {
    public Impediment(String title, String detail) {
        Objects.requireNonNull(title, "Inpedimentにはtitleが必須です");
        this.title = title;
        this.detail = detail;
    }

    private String title;
    private String detail;
}
