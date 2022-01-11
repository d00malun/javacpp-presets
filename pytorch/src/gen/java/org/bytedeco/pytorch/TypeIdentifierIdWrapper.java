// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.Module;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;


/**
 * This template simplifies generation of simple classes that wrap an id
 * in a typesafe way. Namely, you can use it to create a very lightweight
 * type that only offers equality comparators and hashing. Example:
 *
 *   struct MyIdType final : IdWrapper<MyIdType, uint32_t> {
 *     constexpr explicit MyIdType(uint32_t id): IdWrapper(id) {}
 *   };
 *
 * Then in the global top level namespace:
 *
 *   C10_DEFINE_HASH_FOR_IDWRAPPER(MyIdType);
 *
 * That's it - equality operators and hash functions are automatically defined
 * for you, given the underlying type supports it.
 */
@Name("c10::IdWrapper<TypeIdentifier,c10::util::type_index>") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class TypeIdentifierIdWrapper extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TypeIdentifierIdWrapper(Pointer p) { super(p); }

}