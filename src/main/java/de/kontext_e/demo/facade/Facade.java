package de.kontext_e.demo.facade;

import de.kontext_e.demo.business.Business;
import de.kontext_e.demo.core.Core;
import de.kontext_e.demo.processor.Processor;
import de.kontext_e.demo.parser.Parser;
import de.kontext_e.demo.importer.Importer;
import de.kontext_e.demo.manager.Manager;
import de.kontext_e.demo.cache.Cache;
import de.kontext_e.demo.exporter.Exporter;

public class Facade {
    private Processor processor;
    private Parser parser;
    private Exporter exporter;
    private Manager manager;
    private Cache cache;
    private Importer importer;
    private Core core;
    private Business business;
}
