package com.crud.generator.crudgenerator.controller.impl;

import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@AutoConfigureMockMvc
@RunWith(SpringRunner.class)
public class AnswerControllerImplTest {
    //TODO: create the data Test generator class AnswerBuilder
//    private static final String ENDPOINT_URL = "/answers";
//    @MockBean
//    private ReferenceMapper referenceMapper;
//    @InjectMocks
//    private AnswerControllerImpl answerController;
//    @MockBean
//    private AnswerService answerService;
//    @MockBean
//    private AnswerMapper answerMapper;
//    @Autowired
//    private MockMvc mockMvc;
//
//    @Before
//    public void setup() {
//        this.mockMvc = MockMvcBuilders.standaloneSetup(this.answerController).build();
//    }
//
//    @Test
//    public void getAll() throws Exception {
//        Mockito.when(answerMapper.asDTOList(ArgumentMatchers.any())).thenReturn(AnswerBuilder.getListDTO());
//
//        Mockito.when(answerService.findAll()).thenReturn(AnswerBuilder.getListEntities());
//        mockMvc.perform(MockMvcRequestBuilders.get(ENDPOINT_URL))
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andExpect(MockMvcResultMatchers.content()
//                        .contentType(MediaType.APPLICATION_JSON_UTF8))
//                .andExpect(MockMvcResultMatchers.jsonPath("$", Matchers.hasSize(2)));
//
//    }
//
//    @Test
//    public void getById() throws Exception {
//        Mockito.when(answerMapper.asDTO(ArgumentMatchers.any())).thenReturn(AnswerBuilder.getDTO());
//
//        Mockito.when(answerService.findById(ArgumentMatchers.anyLong())).thenReturn(java.util.Optional.of(AnswerBuilder.getEntity()));
//
//        mockMvc.perform(MockMvcRequestBuilders.get(ENDPOINT_URL + "/1"))
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andExpect(MockMvcResultMatchers.content()
//                        .contentType(MediaType.APPLICATION_JSON_UTF8))
//                .andExpect(MockMvcResultMatchers.jsonPath("$.id", Is.is(1)));
//        Mockito.verify(answerService, Mockito.times(1)).findById(1L);
//        Mockito.verifyNoMoreInteractions(answerService);
//    }
//
//    @Test
//    public void save() throws Exception {
//        Mockito.when(answerMapper.asEntity(ArgumentMatchers.any())).thenReturn(AnswerBuilder.getEntity());
//        Mockito.when(answerService.save(ArgumentMatchers.any(Answer.class))).thenReturn(AnswerBuilder.getEntity());
//
//        mockMvc.perform(
//                        MockMvcRequestBuilders.post(ENDPOINT_URL)
//                                .contentType(MediaType.APPLICATION_JSON_UTF8)
//                                .content(CustomUtils.asJsonString(AnswerBuilder.getDTO())))
//                .andExpect(MockMvcResultMatchers.status().isCreated());
//        Mockito.verify(answerService, Mockito.times(1)).save(ArgumentMatchers.any(Answer.class));
//        Mockito.verifyNoMoreInteractions(answerService);
//    }
//
//    @Test
//    public void update() throws Exception {
//        Mockito.when(answerMapper.asEntity(ArgumentMatchers.any())).thenReturn(AnswerBuilder.getEntity());
//        Mockito.when(answerService.update(ArgumentMatchers.any(), ArgumentMatchers.anyLong())).thenReturn(AnswerBuilder.getEntity());
//
//        mockMvc.perform(
//                        MockMvcRequestBuilders.put(ENDPOINT_URL + "/1")
//                                .contentType(MediaType.APPLICATION_JSON_UTF8)
//                                .content(CustomUtils.asJsonString(AnswerBuilder.getDTO())))
//                .andExpect(MockMvcResultMatchers.status().isOk());
//        Mockito.verify(answerService, Mockito.times(1)).update(ArgumentMatchers.any(Answer.class), ArgumentMatchers.anyLong());
//        Mockito.verifyNoMoreInteractions(answerService);
//    }
//
//    @Test
//    public void delete() throws Exception {
//        Mockito.doNothing().when(answerService).deleteById(ArgumentMatchers.anyLong());
//        mockMvc.perform(
//                        MockMvcRequestBuilders.delete(ENDPOINT_URL + "/1"))
//                .andExpect(MockMvcResultMatchers.status().isOk());
//        Mockito.verify(answerService, Mockito.times(1)).deleteById(Mockito.anyLong());
//        Mockito.verifyNoMoreInteractions(answerService);
//    }
}