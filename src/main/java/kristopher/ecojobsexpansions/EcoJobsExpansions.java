package kristopher.ecojobsexpansions;

        import kristopher.ecojobsexpansions.EcoJobsExpansions;
        import me.clip.placeholderapi.expansion.PlaceholderExpansion;
        import con.
        import org.bukkit.Bukkit;
        import org.bukkit.entity.Player;

public class EcoJobsExpansion extends PlaceholderExpansion {

    EcoJobs plugin;

    @Override
    public String getAuthor() {
        return "Kristopher";
    }

    @Override
    public String getIdentifier() {
        return "ecojobexpansions";
    }

    @Override
    public String getRequiredPlugin() {
        return "EcoJobs";
    }

    @Override
    public boolean canRegister() {
        return (plugin = (EcoJobs) Bukkit.getPluginManager().getPlugin(getRequiredPlugin())) != null;
    }

    @Override
    public String onPlaceholderRequest(Player p, String identifier) {
        if(identifier.equalsIgnoreCase("TotalJobLevel")) {
        }
        return null;
    }

}