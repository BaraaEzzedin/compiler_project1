import java.io.IOException;
import java.nio.file.*;

public class TestMain {
    public static void main(String[] args) {
        try {
            Compiler compiler = new Compiler();
            compiler.generate();

            watchForChanges(compiler);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void watchForChanges(Compiler compiler)
            throws IOException, InterruptedException {

        WatchService watcher =
                FileSystems.getDefault().newWatchService();

        Path dataPath = Paths.get("compiler_output");

        dataPath.register(
                watcher,
                StandardWatchEventKinds.ENTRY_MODIFY
        );

        System.out.println("Watching data folder...");

        while (true) {

            WatchKey key = watcher.take();

            for (WatchEvent<?> event : key.pollEvents()) {

                String file =
                        event.context().toString();

                if (file.equals("products.json")) {

                    System.out.println("products.json changed.");

                    try {
                        compiler.generate();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }

            key.reset();
        }
    }
}
