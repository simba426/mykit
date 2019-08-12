package thumbnail;

import net.coobird.thumbnailator.Thumbnails;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Thumbnail {

    public static void main (String argvs[]) {
        Thumbnail tn = new Thumbnail();
    }

    public void localCompress (String filepath, float scale, float quality) {
        /*
        该方法用于本地端图片压缩
        scale和quality范围从0～1，浮点型
        scale代表图片尺寸缩放范围
        quality代表压缩程度
         */
        try {
            Date date = new Date();
            SimpleDateFormat dataformat = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
            Thumbnails.of(filepath)
                    .scale(scale).outputQuality(quality)
                    .outputFormat("jpg")
                    .toFile("/Users/simba/Desktop/" + dataformat.format(date));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void localCompress (String filepath, float quality) {
        /*
        该方法用于本地端图片压缩
        quality范围从0～1，浮点型
        quality代表压缩程度
         */
        try {
            Date date = new Date();
            SimpleDateFormat dataformat = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
            Thumbnails.of(filepath)
                    .scale(1f).outputQuality(quality)
                    .outputFormat("jpg")
                    .toFile("/Users/simba/Desktop/" + dataformat.format(date));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
    public void webCompress (InputStream is, float quality) {
        OutputStream os = null;
        try {
            if (null != is && 0 != is.available()) {
                Date date = new Date();
                SimpleDateFormat dataformat = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
                Thumbnails.of(is)
                        .scale(1f).outputQuality(quality)
                        .outputFormat("jpg");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

     */
}
