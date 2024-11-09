package org.example.p2pnetwork.p2p;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Represents a peer in the network with a unique ID and address.
 */
@Data
public class Peer {
    private String nodeId; //Unique identifier for node
    private String nodeAddress; //Address of the peer in the format IP:port
}