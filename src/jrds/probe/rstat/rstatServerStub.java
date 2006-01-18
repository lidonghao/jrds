/*
 * Automatically generated by jrpcgen 1.0.6 on 14/01/06 17:02
 * jrpcgen is part of the "Remote Tea" ONC/RPC package for Java
 * See http://remotetea.sourceforge.net for details
 */
package tests.org.acplt.oncrpc.jrpcgen;
import org.acplt.oncrpc.*;
import java.io.IOException;

import java.net.InetAddress;

import org.acplt.oncrpc.server.*;

/**
 */
public abstract class rstatServerStub extends OncRpcServerStub implements OncRpcDispatchable {

    public rstatServerStub()
           throws OncRpcException, IOException {
        this(0);
    }

    public rstatServerStub(int port)
           throws OncRpcException, IOException {
        this(null, port);
    }

    public rstatServerStub(InetAddress bindAddr, int port)
           throws OncRpcException, IOException {
        info = new OncRpcServerTransportRegistrationInfo [] {
            new OncRpcServerTransportRegistrationInfo(rstat.RSTATPROG, 3),
            new OncRpcServerTransportRegistrationInfo(rstat.RSTATPROG, 2),
            new OncRpcServerTransportRegistrationInfo(rstat.RSTATPROG, 1),
        };
        transports = new OncRpcServerTransport [] {
            new OncRpcUdpServerTransport(this, bindAddr, port, info, 32768),
            new OncRpcTcpServerTransport(this, bindAddr, port, info, 32768)
        };
    }

    public void dispatchOncRpcCall(OncRpcCallInformation call, int program, int version, int procedure)
           throws OncRpcException, IOException {
        if ( version == 3 ) {
            switch ( procedure ) {
            case 1: {
                call.retrieveCall(XdrVoid.XDR_VOID);
                statstime result$ = RSTATPROC_STATS_3();
                call.reply(result$);
                break;
            }
            case 2: {
                call.retrieveCall(XdrVoid.XDR_VOID);
                XdrInt result$ = new XdrInt(RSTATPROC_HAVEDISK_3());
                call.reply(result$);
                break;
            }
            default:
                call.failProcedureUnavailable();
            }
        } else if ( version == 2 ) {
            switch ( procedure ) {
            case 1: {
                call.retrieveCall(XdrVoid.XDR_VOID);
                statsswtch result$ = RSTATPROC_STATS_2();
                call.reply(result$);
                break;
            }
            case 2: {
                call.retrieveCall(XdrVoid.XDR_VOID);
                XdrInt result$ = new XdrInt(RSTATPROC_HAVEDISK_2());
                call.reply(result$);
                break;
            }
            default:
                call.failProcedureUnavailable();
            }
        } else if ( version == 1 ) {
            switch ( procedure ) {
            case 1: {
                call.retrieveCall(XdrVoid.XDR_VOID);
                stats result$ = RSTATPROC_STATS_1();
                call.reply(result$);
                break;
            }
            case 2: {
                call.retrieveCall(XdrVoid.XDR_VOID);
                XdrInt result$ = new XdrInt(RSTATPROC_HAVEDISK_1());
                call.reply(result$);
                break;
            }
            default:
                call.failProcedureUnavailable();
            }
        } else {
            call.failProcedureUnavailable();
        }
    }

    public abstract statstime RSTATPROC_STATS_3();

    public abstract int RSTATPROC_HAVEDISK_3();

    public abstract statsswtch RSTATPROC_STATS_2();

    public abstract int RSTATPROC_HAVEDISK_2();

    public abstract stats RSTATPROC_STATS_1();

    public abstract int RSTATPROC_HAVEDISK_1();

}
// End of rstatServerStub.java