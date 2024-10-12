// Accumulo Client API
import org.apache.accumulo.core.client.*;
import org.apache.accumulo.core.client.admin.*;
import org.apache.accumulo.core.client.admin.compaction.*;
import org.apache.accumulo.core.client.lexicoder.*;
import org.apache.accumulo.core.client.mapred.*;
import org.apache.accumulo.core.client.mapreduce.*;
import org.apache.accumulo.core.client.mapreduce.lib.partition.*;
import org.apache.accumulo.core.client.replication.*;
import org.apache.accumulo.core.client.rfile.*;
import org.apache.accumulo.core.client.sample.*;
import org.apache.accumulo.core.client.security.*;
import org.apache.accumulo.core.client.security.tokens.*;
import org.apache.accumulo.core.client.summary.*;
import org.apache.accumulo.core.client.summary.summarizers.*;

// Accumulo Data API
import org.apache.accumulo.core.data.*;
import org.apache.accumulo.core.data.constraints.*;

// Accumulo Security API
import org.apache.accumulo.core.security.*;

// Accumulo MiniCluster API
import org.apache.accumulo.minicluster.*;

// Accumulo Hadoop API
import org.apache.accumulo.hadoop.mapreduce.*;
import org.apache.accumulo.hadoop.mapreduce.partition.*;

// Essential Hadoop API
import org.apache.hadoop.io.Text;

// Initialization Code
System.out.println("Preparing JShell for Apache Accumulo");
System.out.println();

// Accumulo Client Build
  URL clientPropUrl =
    AccumuloClient.class.getClassLoader().getResource("accumulo-client.properties");
  AccumuloClient client = null;

  // Does Accumulo properties exists?
  if (clientPropUrl != null) {

    // Build Accumulo Client
    client = Accumulo.newClient().from(clientPropUrl).build();
    System.out.println("Use 'client' to interact with Accumulo\n");

  } else
      System.out.println("'accumulo-client.properties' was not found on the classpath\n");
