package de.kontext_e.demo.facade;

import de.kontext_e.demo.business.Business;
import de.kontext_e.demo.cache.Cache;
import de.kontext_e.demo.core.Core;
import de.kontext_e.demo.manager.Manager;
import de.kontext_e.demo.parser.Parser;
import de.kontext_e.demo.processor.Processor;

public class Facade {
    private Cache cache;
    private Processor processor;
    private Parser parser;
    private Manager manager;
    private Core core;
    private Business business;
}
