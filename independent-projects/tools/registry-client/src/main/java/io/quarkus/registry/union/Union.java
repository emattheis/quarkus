package io.quarkus.registry.union;

import java.util.Collection;

public interface Union {

    /**
     * Union version.
     *
     * @return union version
     */
    UnionVersion verion();

    /**
     * Members of the union.
     *
     * @return members of the union
     */
    Collection<Member> members();

    /**
     * Returns a union member associated with a key or null, in case
     * the union does not contain a member associated with the key.
     *
     * @param memberKey member key
     * @return member corresponding to the key or null, in case the member with the key was not found in the union
     */
    Member member(Object memberKey);
}
