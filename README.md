# SWE4403ContactList


Java project for my Software Architecture and Design patterns project as part of my Software Engineering Degree. The application is a simple contact book using Java Swing (created in netbeans). The purpose of the project was to demonstrate an understanding of design patterns, done by including 12 patterns in the relatively small application.

Here are the patterns used:

1. Layered architectural pattern: GUI, System, and data layers
2. Facade: SystemFacade class
3. Command: Used in UI for creating add and delete commands
4. Momento: Used with Command to support undo of add/delete commands
5. Prototype: Used in UI/facade for creation of Command objects
6. Abstract Factory: Used in ContactManager for the creation of Contacts
7. Singleton: RealDataManager, DataManagerProxy, and facade are singletons
8. Iterator: Used in ContactFinder, ContactManager, DataMangerProxy, and
SystemFacade to iterate through contact list
9. Visitor: Used in ContactManager to add and delete contacts
10. Decorator: Used in UI to print contacts with decorative features (brackets and stars)
around the fields
11. Strategy: Used in ContactAddVisitor to add contacts at the end or at the beginning of
the contactList
12. Proxy: DataManagerProxy is a virtual proxy for RealDataManager.
