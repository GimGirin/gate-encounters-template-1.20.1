package net.gim.gate_enc.world.dimension;

import com.google.common.io.Resources;
import net.minecraft.resource.Resource;
import net.minecraft.resource.ResourceFinder;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.Identifier;
import net.minecraft.util.WorldSavePath;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Paths;

public final class CopyEnc00 {
    public static void copyRegionToWorld(MinecraftServer server) throws IOException, URISyntaxException {

        File path = new File(server.getSavePath(WorldSavePath.ROOT).resolve("dimensions/gate_enc/encounter_00/").toString());

        if (!path.exists()) {
            path.mkdirs();
        }

        String target = server.getSavePath(WorldSavePath.ROOT).resolve("dimensions/gate_enc/encounter_00/").toString();

        File TO = new File(target);
//        File From =
        File FROM = new File(Paths.get(CopyEnc00.class.getResource("/data/gate_enc/dimension/encounter_00/").toURI()).toString());

        System.out.println(CopyEnc00.class.getResource("/data/gate_enc/dimension/encounter_00/"));

        FileUtils.copyDirectory(FROM, TO,true);
    }
}
