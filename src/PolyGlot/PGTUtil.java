/*
 * Copyright (c) 2014-2015, Draque Thompson, draquemail@gmail.com
 * All rights reserved.
 *
 * Licensed under: Creative Commons Attribution-NonCommercial 4.0 International Public License
 * See LICENSE.TXT included with this code to read the full license agreement.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */

package PolyGlot;

import PolyGlot.Screens.*;

/**
 * This contains all the XML markers for saving/loading files
 * @author draque
 */
public class PGTUtil {
    // properties on words
    public static final String dictionaryXID = "dictionary";
    public static final String pgVersionXID = "PolyGlotVer";
    public static final String wordXID = "word";
    public static final String localWordXID = "localWord";
    public static final String conWordXID = "conWord";
    public static final String wordTypeXID = "wordType";
    public static final String WORDTYPEID_XID = "wordTypeId";
    public static final String wordGenderXID = "wordGender";
    public static final String wordIdXID = "wordId";
    public static final String wordPlurXID = "wordPlural"; // LEGACY VALUE
    public static final String wordProcOverrideXID = "wordProcOverride";
    public static final String definitionXID = "definition";
    public static final String wordAutoDeclenOverrideXID = "autoDeclOverride";
    public static final String pronunciationXID = "pronunciation";
    public static final String wordRuleOverrideXID = "wordRuleOverride";
    
    // properties for types/parts of speech
    // TODO: rename the objects (NOT THEIR VALUES) to match modern standards
    public static final String wordClassXID = "class";
    public static final String wordClassNameXID = "className";
    public static final String wordClassIdXID = "classId";
    public static final String wordClassNotesXID = "classNotes";
    public static final String wordClassGenderManXID = "genderMandatoryClass";
    public static final String wordClassProcManXID = "pronunciationMandatoryClass";
    public static final String wordClassPlurManXID = "pluralityMandatoryClass";
    public static final String wordClassDefManXID = "definitionMandatoryClass";
    public static final String wordClassPatternXID = "classPattern";
    public static final String wordClassGlossXID = "classGloss";
    
    // properties for genders
    public static final String genderXID = "gender";
    public static final String genderNameXID = "genderName";
    public static final String genderIdXID = "genderId";
    public static final String genderNotesXID = "genderNotes";    
    
    // language properties
    public static final String fontConXID = "fontCon";
    public static final String fontLocalXID = "fontLocal";
    public static final String langPropLangNameXID = "langName";
    public static final String langPropFontSizeXID = "fontSize";
    public static final String langPropFontStyleXID = "fontStyle";
    public static final String langPropAlphaOrderXID = "alphaOrder";
    public static final String langPropTypeMandatoryXID = "langPropTypeMandatory";
    public static final String langPropLocalMandatoryXID = "langPropLocalMandatory";
    public static final String langPropWordUniquenessXID = "langPropWordUniqueness";
    public static final String langPropLocalUniquenessXID = "langPropLocalUniqueness";
    public static final String langPropIgnoreCaseXID = "langPropIgnoreCase";
    public static final String langPropDisableProcRegexXID = "langPropDisableProcRegex";
    public static final String langPropEnforceRTLXID = "langPropEnforceRTL";
    public static final String langPropAuthCopyrightXID = "langPropAuthorCopyright";
    public static final String langPropLocalLangNameXID = "langPropLocalLangName";
    
    // declension properties
    public static final String declensionXID = "declensionNode";
    public static final String declensionIdXID = "declensionId";
    public static final String declensionTextXID = "declensionText";
    public static final String declensionComDimIdXID = "combinedDimId";
    public static final String declensionNotesXID = "declensionNotes";
    public static final String declensionIsTemplateXID = "declensionTemplate";
    public static final String declensionRelatedIdXID = "declensionRelatedId";
    public static final String declensionMandatoryXID = "declensionMandatory";
    
    // dimensional declension properties
    public static final String dimensionNodeXID = "dimensionNode";
    public static final String dimensionIdXID = "dimensionId";
    public static final String dimensionMandXID = "dimensionMand";
    public static final String dimensionNameXID = "dimensionName";
    
    // pronunciation properties
    public static final String proGuideXID = "proGuide";
    public static final String proGuideBaseXID = "proGuideBase";
    public static final String proGuidePhonXID = "proGuidePhon";
    
    // thesaurus properties
    public static final String thesNodeXID = "thesNode";
    public static final String thesNotesXID = "thesNotes";
    public static final String thesNameXID = "thesName";
    public static final String thesWordXID = "thesWord";
    
    // autodeclansion generation properties
    public static final String decGenRuleXID = "decGenRule";
    public static final String decGenRuleTypeXID = "decGenRuleTypeId";
    public static final String decGenRuleCombXID = "decGenRuleComb";
    public static final String decGenRuleRegexXID = "decGenRuleRegex";
    public static final String decGenRuleNameXID = "decGenRuleName";
    
    // autodeclension transform properties
    public static final String decGenTransXID = "decGenTrans";
    public static final String decGenTransRegexXID = "decGenTransRegex";
    public static final String decGenTransReplaceXID = "decGenTransReplace";
    
    // constructed declension dimension properties
    public static final String decCombinedFormSectionXID = "decCombinedFormSection";
    public static final String decCombinedFormXID = "decCombinedForm";
    public static final String decCombinedIdXID = "decCombinedId";
    public static final String decCombinedSurpressXID = "decCombinedSurpress";
    
    // properties for logographs
    public static final String logoRootNoteXID = "logoRootNode";
    public static final String logoGraphsCollectionXID = "logoGraphsCollection";
    public static final String logoStrokesXID = "logoStrokes";
    public static final String logoNotesXID = "logoNotes";
    public static final String logoIsRadicalXID = "logoIsRadical";
    public static final String logoRadicalListXID = "logoRadicalList";
    public static final String logoReadingXID = "logoReading";
    public static final String logoGraphValueXID = "logoGraphValue";
    public static final String logoGraphIdXID = "logoGraphId";
    public static final String logoGraphNodeXID = "LogoGraphNode";
    public static final String logoWordRelationXID = "LogoWordRelation";
    public static final String logoRelationsCollectionXID = "LogoRelationsCollection";
    
    // properties for the grammar dictioary
    public static final String grammarSectionXID = "grammarCollection";        
    public static final String grammarChapterNodeXID = "grammarChapterNode";
    public static final String grammarChapterNameXID = "grammarChapterName";
    public static final String grammarSectionsListXID = "grammarSectionsList";
    public static final String grammarSectionNodeXID = "grammarSectionNode";
    public static final String grammarSectionNameXID = "grammarSectionName";
    public static final String grammarSectionRecordingXID = "grammarSectionRecordingXID";
    public static final String grammarSectionTextXID = "grammarSectionText";
    
    // constants for PolyGlot options found in PolyGlot.ini
    public static final int optionsNumLastFiles = 5;
    public static final String optionsLastFiles = "LastFiles";
    public static final String optionsScreenPos = "ScreenPositions";
    public static final String optionsScreensSize = "ScreenSizes";
    public static final String optionsScreensOpen = "ScreensUp";
        
    // string constants
    public static final String dictFileName = "PGDictionary.xml";
    public static final String fontFileName = "conLangFont";
    public static final String LCDFontLocation = "/PolyGlot/GeneralResources/lcdFont.ttf";
    public static final String UnicodeFontLocation = "/PolyGlot/GeneralResources/unicode.ttf";
    public static final String logoGraphSavePath = "logoGraphs/";
    public static final String grammarSoundSavePath = "grammarSounds/";
    public static final String emptyFile = "<EMPTY>";
    public static final String tempFile = "xxTEMPPGTFILExx";
    public static final String polyGlotFont = "PolyGlot";
    public static final String conLangFont = "PolyGlotConlangGrammarFont";
    public static final String polyGlotIni = "PolyGlot.ini";
    public static final String emptyLogoImage = "/PolyGlot/ImageAssets/EmptyImage.png";
    public static final String IPAOtherSounds = "/PolyGlot/ImageAssets/IPA_Other.png";
    public static final String jarArchiveName = "PolyGlot.jar";
    public static final String ipaSoundsLocation = "/PolyGlot/SoundAssets/";
    
    // screen names when they're required as constants...
    public static final String scrNameLexicon = ScrLexicon.class.getName();
    public static final String scrNameGrammar = ScrGrammarGuide.class.getName();
    public static final String scrNameLogo = ScrLogoDetails.class.getName();
    public static final String scrNameThes = ScrThesaurus.class.getName();
    public static final String scrIPARefChart = ScrIPARefChart.class.getName();
    
    /**
     * This records the mode of a given PDialog or PFrame window. Defaults to
     * STANDARD
     */
    public enum WindowMode {
        STANDARD, SINGLEVALUE, SELECTLIST
    }
}
