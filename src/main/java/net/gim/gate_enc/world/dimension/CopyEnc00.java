package net.gim.gate_enc.world.dimension;

import net.minecraft.server.MinecraftServer;
import net.minecraft.util.WorldSavePath;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;

public final class CopyEnc00 {
    public static void copyRegionToWorld(MinecraftServer server) throws IOException, URISyntaxException {

        File path = new File(server.getSavePath(WorldSavePath.ROOT).resolve("dimensions/gate_enc/encounter_00/region").toString());

        // Creates the region folder if it doesn't exist yet
        if (!path.exists()) {
            path.mkdirs();
        }

        Path TO = server.getSavePath(WorldSavePath.ROOT).resolve("dimensions/gate_enc/encounter_00/region");
        Path FROM = Path.of("data/gate_enc/dimension/encounter_00/region/");

        copyToRegionDir(TO, FROM);

    }

    private static void copyToRegionDir(Path destination, Path from) throws IOException {
        String[] regionIDs = {"r.0.0.mca", "r.0.-1.mca", "r.-1.0.mca", "r.-1.-1.mca", "r.-2.0.mca", "r.-2.-1.mca"};

        for (String regionID : regionIDs) {
            String resourcePath = from.toString() + "/" + regionID;
            Path filePath = Path.of(destination.toString() + "/" + regionID);

            // Read the region file inside the data folder and copy it to the region folder
            try (InputStream stream = CopyEnc00.class.getClassLoader().getResourceAsStream(resourcePath)) {
                Files.copy(stream, filePath);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}