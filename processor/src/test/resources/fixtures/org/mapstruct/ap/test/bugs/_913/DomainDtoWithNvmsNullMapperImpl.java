/*
 * Copyright MapStruct Authors.
 *
 * Licensed under the Apache License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */
package org.mapstruct.ap.test.bugs._913;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2017-05-06T00:06:20+0200",
    comments = "version: , compiler: javac, environment: Java 1.8.0_131 (Oracle Corporation)"
)
public class DomainDtoWithNvmsNullMapperImpl implements DomainDtoWithNvmsNullMapper {

    private final Helper helper = new Helper();

    @Override
    public Domain create(Dto source) {
        if ( source == null ) {
            return null;
        }

        Domain domain = createNullDomain();

        domain.setLongsInitialized( stringListToLongSet( source.getStringsInitialized() ) );
        domain.setLongs( stringListToLongSet( source.getStrings() ) );
        List<String> list = source.getStrings();
        if ( list != null ) {
            domain.setStrings( new HashSet<String>( list ) );
        }
        List<String> list1 = source.getStringsWithDefault();
        if ( list1 != null ) {
            domain.setStringsWithDefault( new ArrayList<String>( list1 ) );
        }
        else {
            domain.setStringsWithDefault( helper.toList( "3" ) );
        }
        List<String> list2 = source.getStringsInitialized();
        if ( list2 != null ) {
            domain.setStringsInitialized( new HashSet<String>( list2 ) );
        }

        return domain;
    }

    @Override
    public void update(Dto source, Domain target) {
        if ( source == null ) {
            return;
        }

        if ( target.getLongs() != null ) {
            Set<Long> set = stringListToLongSet( source.getStrings() );
            if ( set != null ) {
                target.getLongs().clear();
                target.getLongs().addAll( set );
            }
            else {
                target.setLongs( null );
            }
        }
        else {
            Set<Long> set = stringListToLongSet( source.getStrings() );
            if ( set != null ) {
                target.setLongs( set );
            }
        }
        if ( target.getStrings() != null ) {
            List<String> list = source.getStrings();
            if ( list != null ) {
                target.getStrings().clear();
                target.getStrings().addAll( list );
            }
            else {
                target.setStrings( null );
            }
        }
        else {
            List<String> list = source.getStrings();
            if ( list != null ) {
                target.setStrings( new HashSet<String>( list ) );
            }
        }
        if ( target.getLongsInitialized() != null ) {
            Set<Long> set1 = stringListToLongSet( source.getStringsInitialized() );
            if ( set1 != null ) {
                target.getLongsInitialized().clear();
                target.getLongsInitialized().addAll( set1 );
            }
            else {
                target.setLongsInitialized( null );
            }
        }
        else {
            Set<Long> set1 = stringListToLongSet( source.getStringsInitialized() );
            if ( set1 != null ) {
                target.setLongsInitialized( set1 );
            }
        }
        if ( target.getStringsWithDefault() != null ) {
            List<String> list1 = source.getStringsWithDefault();
            if ( list1 != null ) {
                target.getStringsWithDefault().clear();
                target.getStringsWithDefault().addAll( list1 );
            }
            else {
                target.setStringsWithDefault( helper.toList( "3" ) );
            }
        }
        else {
            List<String> list1 = source.getStringsWithDefault();
            if ( list1 != null ) {
                target.setStringsWithDefault( new ArrayList<String>( list1 ) );
            }
            else {
                target.setStringsWithDefault( helper.toList( "3" ) );
            }
        }
        if ( target.getStringsInitialized() != null ) {
            List<String> list2 = source.getStringsInitialized();
            if ( list2 != null ) {
                target.getStringsInitialized().clear();
                target.getStringsInitialized().addAll( list2 );
            }
            else {
                target.setStringsInitialized( null );
            }
        }
        else {
            List<String> list2 = source.getStringsInitialized();
            if ( list2 != null ) {
                target.setStringsInitialized( new HashSet<String>( list2 ) );
            }
        }
    }

    @Override
    public Domain updateWithReturn(Dto source, Domain target) {
        if ( source == null ) {
            return null;
        }

        if ( target.getLongs() != null ) {
            Set<Long> set = stringListToLongSet( source.getStrings() );
            if ( set != null ) {
                target.getLongs().clear();
                target.getLongs().addAll( set );
            }
            else {
                target.setLongs( null );
            }
        }
        else {
            Set<Long> set = stringListToLongSet( source.getStrings() );
            if ( set != null ) {
                target.setLongs( set );
            }
        }
        if ( target.getStrings() != null ) {
            List<String> list = source.getStrings();
            if ( list != null ) {
                target.getStrings().clear();
                target.getStrings().addAll( list );
            }
            else {
                target.setStrings( null );
            }
        }
        else {
            List<String> list = source.getStrings();
            if ( list != null ) {
                target.setStrings( new HashSet<String>( list ) );
            }
        }
        if ( target.getLongsInitialized() != null ) {
            Set<Long> set1 = stringListToLongSet( source.getStringsInitialized() );
            if ( set1 != null ) {
                target.getLongsInitialized().clear();
                target.getLongsInitialized().addAll( set1 );
            }
            else {
                target.setLongsInitialized( null );
            }
        }
        else {
            Set<Long> set1 = stringListToLongSet( source.getStringsInitialized() );
            if ( set1 != null ) {
                target.setLongsInitialized( set1 );
            }
        }
        if ( target.getStringsWithDefault() != null ) {
            List<String> list1 = source.getStringsWithDefault();
            if ( list1 != null ) {
                target.getStringsWithDefault().clear();
                target.getStringsWithDefault().addAll( list1 );
            }
            else {
                target.setStringsWithDefault( helper.toList( "3" ) );
            }
        }
        else {
            List<String> list1 = source.getStringsWithDefault();
            if ( list1 != null ) {
                target.setStringsWithDefault( new ArrayList<String>( list1 ) );
            }
            else {
                target.setStringsWithDefault( helper.toList( "3" ) );
            }
        }
        if ( target.getStringsInitialized() != null ) {
            List<String> list2 = source.getStringsInitialized();
            if ( list2 != null ) {
                target.getStringsInitialized().clear();
                target.getStringsInitialized().addAll( list2 );
            }
            else {
                target.setStringsInitialized( null );
            }
        }
        else {
            List<String> list2 = source.getStringsInitialized();
            if ( list2 != null ) {
                target.setStringsInitialized( new HashSet<String>( list2 ) );
            }
        }

        return target;
    }

    protected Set<Long> stringListToLongSet(List<String> list) {
        if ( list == null ) {
            return null;
        }

        Set<Long> set = new HashSet<Long>( Math.max( (int) ( list.size() / .75f ) + 1, 16 ) );
        for ( String string : list ) {
            set.add( Long.parseLong( string ) );
        }

        return set;
    }
}
