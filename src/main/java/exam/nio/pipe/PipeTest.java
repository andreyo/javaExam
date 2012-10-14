package exam.nio.pipe;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Pipe;

/**
 * Created by IntelliJ IDEA.
 * User: Elena
 * Date: 19.08.12
 * Time: 19:58
 * To change this template use File | Settings | File Templates.
 */
public class PipeTest {
    public static void main(String[] args) throws IOException {
        Pipe pipe = Pipe.open();
        Pipe.SinkChannel sink = pipe.sink();
        sink.write(new ByteBuffer[]{});
        Pipe.SourceChannel source = pipe.source();
        source.read(new ByteBuffer[]{});

    }
}
