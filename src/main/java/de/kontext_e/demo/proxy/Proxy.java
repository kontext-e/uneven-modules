package de.kontext_e.demo.proxy;

import de.kontext_e.demo.base_core.BaseCore;
import de.kontext_e.demo.base_manager.BaseManager;
import de.kontext_e.demo.client.Client;
import de.kontext_e.demo.config.Config;
import de.kontext_e.demo.core.Core;
import de.kontext_e.demo.manager.Manager;
import de.kontext_e.demo.scheduler.Scheduler;
import de.kontext_e.demo.transport.Transport;

public class Proxy {
    private Client client;
    private Config config;
    private Transport transport;
    private Manager manager;
    private Scheduler scheduler;
    private Core core;
    private BaseManager baseManager;
    private BaseCore baseCore;
}
