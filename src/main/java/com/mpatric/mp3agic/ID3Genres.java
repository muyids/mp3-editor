package com.mpatric.mp3agic;

/**
 * @author dwyang
 * @Date 2023-06-11
 */
public class ID3Genres {

    public static final String[] GENRES = {
            "Blues",                    // 蓝调
            "Classic Rock",             // 经典摇滚
            "Country",                  // 乡村
            "Dance",                    // 舞曲
            "Disco",                    // 迪斯科
            "Funk",                     // 放克
            "Grunge",                   // 垃圾摇滚
            "Hip-Hop",                  // 嘻哈
            "Jazz",                     // 爵士
            "Metal",                    // 金属
            "New Age",                  // 新时代
            "Oldies",                   // 经典老歌
            "Other",                    // 其他
            "Pop",                      // 流行音乐
            "R&B",                      // 节奏布鲁斯
            "Rap",                      // 说唱
            "Reggae",                   // 雷鬼
            "Rock",                     // 摇滚
            "Techno",                   // 电子音乐
            "Industrial",               // 工业音乐
            "Alternative",              // 另类音乐
            "Ska",                      // 斯卡音乐
            "Death Metal",              // 死亡金属
            "Pranks",                   // 恶作剧
            "Soundtrack",               // 原声音乐
            "Euro-Techno",              // 欧洲电子音乐
            "Ambient",                  // 环境音乐
            "Trip-Hop",                 // 贝斯音乐
            "Vocal",                    // 人声音乐
            "Jazz+Funk",                // 爵士放克
            "Fusion",                   // 融合音乐
            "Trance",                   // 迷幻音乐
            "Classical",                // 古典音乐
            "Instrumental",             // 器乐
            "Acid",                     // 酸性音乐
            "House",                    // 浩室音乐
            "Game",                     // 游戏音乐
            "Sound Clip",               // 音效剪辑
            "Gospel",                   // 福音音乐
            "Noise",                    // 噪音音乐
            "Alt Rock",                 // 另类摇滚
            "Bass",                     // 低音音乐
            "Soul",                     // 灵魂音乐
            "Punk",                     // 朋克音乐
            "Space",                    // 太空音乐
            "Meditative",               // 冥想音乐
            "Instrumental Pop",         // 流行器乐
            "Instrumental Rock",        // 摇滚器乐
            "Ethnic",                   // 民族音乐
            "Gothic",                   // 哥特音乐
            "Darkwave",                 // 黑暗波浪音
    };

    public static final String[] GENRES_CN = {
            "蓝调",
            "经典摇滚",
            "乡村",
            "舞曲",
            "迪斯科",
            "放克",
            "垃圾摇滚",
            "嘻哈",
            "爵士",
            "金属",
            "新时代",
            "经典老歌",
            "其他",
            "流行音乐",
            "节奏布鲁斯",
            "说唱",
            "雷鬼",
            "摇滚",
            "电子音乐",
            "工业音乐",
            "另类音乐",
            "斯卡音乐",
            "死亡金属",
            "恶作剧",
            "原声音乐",
            "欧洲电子音乐",
            "环境音乐",
            "贝斯音乐",
            "人声音乐",
            "爵士放克",
            "融合音乐",
            "迷幻音乐",
            "古典音乐",
            "器乐",
            "酸性音乐",
            "浩室音乐",
            "游戏音乐",
            "音效剪辑",
            "福音音乐",
            "噪音音乐",
            "另类摇滚",
            "低音音乐",
            "灵魂音乐",
            "朋克音乐",
            "太空音乐",
            "冥想音乐",
            "流行器乐",
            "摇滚器乐",
            "民族音乐",
            "哥特音乐",
            "Darkwave",
    };

    /**
     * Match provided description against genres, ignoring case.
     *
     * @return matching genre index or -1
     */
    public static int matchGenreDescription(String description) {
        if (description != null && description.length() > 0) {
            for (int i = 0; i < ID3v1Genres.GENRES.length; i++) {
                if (ID3Genres.GENRES[i].equalsIgnoreCase(description)
                        || ID3Genres.GENRES_CN[i].equalsIgnoreCase(description)) {
                    return i;
                }
            }
        }
        return -1;
    }
}
